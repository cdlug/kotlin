/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.k2js.translate.intrinsic.functions;

import closurecompiler.internal.com.google.common.collect.Lists;
import closurecompiler.internal.com.google.common.collect.Maps;
import com.google.dart.compiler.backend.js.ast.JsExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.descriptors.FunctionDescriptor;
import org.jetbrains.k2js.translate.context.TranslationContext;
import org.jetbrains.k2js.translate.intrinsic.functions.basic.FunctionIntrinsic;
import org.jetbrains.k2js.translate.intrinsic.functions.factories.*;

import java.util.List;
import java.util.Map;

/**
 * @author Pavel Talanov
 */
public final class FunctionIntrinsics {

    @NotNull
    private static final FunctionIntrinsic NO_INTRINSIC = new FunctionIntrinsic() {
        @Override
        public boolean exists() {
            return false;
        }

        @NotNull
        @Override
        public JsExpression apply(@Nullable JsExpression receiver,
                @NotNull List<JsExpression> arguments,
                @NotNull TranslationContext context) {
            throw new UnsupportedOperationException("FunctionIntrinsic#NO_INTRINSIC_#apply");
        }
    };

    @NotNull
    private final Map<FunctionDescriptor, FunctionIntrinsic> intrinsicCache = Maps.newHashMap();

    @NotNull
    private final List<FunctionIntrinsicFactory> factories = Lists.newArrayList();

    public FunctionIntrinsics() {
        registerFactories();
    }

    private void registerFactories() {
        register(PrimitiveUnaryOperationFIF.INSTANCE);
        register(PrimitiveBinaryOperationFIF.INSTANCE);
        register(TupleGetterFIF.INSTANCE);
        register(StringOperationFIF.INSTANCE);
        register(ArrayFIF.INSTANCE);
        register(TopLevelFIF.INSTANCE);
    }

    private boolean register(@NotNull FunctionIntrinsicFactory instance) {
        return factories.add(instance);
    }

    @NotNull
    public FunctionIntrinsic getIntrinsic(@NotNull FunctionDescriptor descriptor) {
        FunctionIntrinsic intrinsic = lookUpCache(descriptor);
        if (intrinsic != null) {
            return intrinsic;
        }
        intrinsic = computeAndCacheIntrinsic(descriptor);
        return intrinsic;
    }

    @Nullable
    private FunctionIntrinsic lookUpCache(@NotNull FunctionDescriptor descriptor) {
        return intrinsicCache.get(descriptor);
    }

    @NotNull
    private FunctionIntrinsic computeAndCacheIntrinsic(@NotNull FunctionDescriptor descriptor) {
        FunctionIntrinsic result = computeIntrinsic(descriptor);
        intrinsicCache.put(descriptor, result);
        return result;
    }

    @NotNull
    private FunctionIntrinsic computeIntrinsic(@NotNull FunctionDescriptor descriptor) {
        for (FunctionIntrinsicFactory factory : factories) {
            if (factory.getPattern().apply(descriptor)) {
                return factory.getIntrinsic(descriptor);
            }
        }
        return NO_INTRINSIC;
    }
}
