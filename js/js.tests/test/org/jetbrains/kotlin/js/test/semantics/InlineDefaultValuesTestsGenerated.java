/*
 * Copyright 2010-2017 JetBrains s.r.o.
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

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxInline/defaultValues")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class InlineDefaultValuesTestsGenerated extends AbstractInlineDefaultValuesTests {
    @TestMetadata("33Parameters.kt")
    public void test33Parameters() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/33Parameters.kt");
        doTest(fileName);
    }

    @TestMetadata("33ParametersInConstructor.kt")
    public void test33ParametersInConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/33ParametersInConstructor.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInDefaultValues() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("defaultInExtension.kt")
    public void testDefaultInExtension() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/defaultInExtension.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethod.kt")
    public void testDefaultMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/defaultMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultMethodInClass.kt")
    public void testDefaultMethodInClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/defaultMethodInClass.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultParamRemapping.kt")
    public void testDefaultParamRemapping() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/defaultParamRemapping.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineInDefaultParameter.kt")
    public void testInlineInDefaultParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/inlineInDefaultParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("inlineLambdaInNoInlineDefault.kt")
    public void testInlineLambdaInNoInlineDefault() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/inlineLambdaInNoInlineDefault.kt");
        doTest(fileName);
    }

    @TestMetadata("kt11479.kt")
    public void testKt11479() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt11479.kt");
        doTest(fileName);
    }

    @TestMetadata("kt11479InlinedDefaultParameter.kt")
    public void testKt11479InlinedDefaultParameter() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt11479InlinedDefaultParameter.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14564.kt")
    public void testKt14564() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt14564.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14564_2.kt")
    public void testKt14564_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt14564_2.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18689.kt")
    public void testKt18689() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt18689.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18689_2.kt")
    public void testKt18689_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt18689_2.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18689_3.kt")
    public void testKt18689_3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt18689_3.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18689_4.kt")
    public void testKt18689_4() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt18689_4.kt");
        doTest(fileName);
    }

    @TestMetadata("kt5685.kt")
    public void testKt5685() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/kt5685.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleDefaultMethod.kt")
    public void testSimpleDefaultMethod() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/simpleDefaultMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("varArgNoInline.kt")
    public void testVarArgNoInline() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/varArgNoInline.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining")
    @TestDataPath("$PROJECT_ROOT")
    public static class LambdaInlining extends AbstractInlineDefaultValuesTests {
        public void testAllFilesPresentInLambdaInlining() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("defaultLambdaInNoInline.kt")
        public void testDefaultLambdaInNoInline() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/defaultLambdaInNoInline.kt");
            doTest(fileName);
        }

        @TestMetadata("instanceCapuredInClass.kt")
        public void testInstanceCapuredInClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapuredInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("instanceCapuredInInterface.kt")
        public void testInstanceCapuredInInterface() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/instanceCapuredInInterface.kt");
            doTest(fileName);
        }

        @TestMetadata("jvmStaticDefault.kt")
        public void testJvmStaticDefault() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/jvmStaticDefault.kt");
            try {
                doTest(fileName);
            }
            catch (Throwable ignore) {
                return;
            }
            throw new AssertionError("Looks like this test can be unmuted. Remove IGNORE_BACKEND directive for that.");
        }

        @TestMetadata("noInline.kt")
        public void testNoInline() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/noInline.kt");
            doTest(fileName);
        }

        @TestMetadata("nonDefaultInlineInNoInline.kt")
        public void testNonDefaultInlineInNoInline() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/nonDefaultInlineInNoInline.kt");
            doTest(fileName);
        }

        @TestMetadata("receiverClash.kt")
        public void testReceiverClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash.kt");
            doTest(fileName);
        }

        @TestMetadata("receiverClash2.kt")
        public void testReceiverClash2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClash2.kt");
            doTest(fileName);
        }

        @TestMetadata("receiverClashInClass.kt")
        public void testReceiverClashInClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("receiverClashInClass2.kt")
        public void testReceiverClashInClass2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/receiverClashInClass2.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleErased.kt")
        public void testSimpleErased() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErased.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleErasedStaticInstance.kt")
        public void testSimpleErasedStaticInstance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleErasedStaticInstance.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleExtension.kt")
        public void testSimpleExtension() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleExtension.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleGeneric.kt")
        public void testSimpleGeneric() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleGeneric.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleStaticInstance.kt")
        public void testSimpleStaticInstance() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/simpleStaticInstance.kt");
            doTest(fileName);
        }

        @TestMetadata("thisClash.kt")
        public void testThisClash() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClash.kt");
            doTest(fileName);
        }

        @TestMetadata("thisClashInClass.kt")
        public void testThisClashInClass() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/thisClashInClass.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences")
        @TestDataPath("$PROJECT_ROOT")
        public static class CallableReferences extends AbstractInlineDefaultValuesTests {
            public void testAllFilesPresentInCallableReferences() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
            }

            @TestMetadata("boundFunctionReference.kt")
            public void testBoundFunctionReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReference.kt");
                doTest(fileName);
            }

            @TestMetadata("boundFunctionReferenceOnInt.kt")
            public void testBoundFunctionReferenceOnInt() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnInt.kt");
                doTest(fileName);
            }

            @TestMetadata("boundFunctionReferenceOnLong.kt")
            public void testBoundFunctionReferenceOnLong() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundFunctionReferenceOnLong.kt");
                doTest(fileName);
            }

            @TestMetadata("boundPropertyReference.kt")
            public void testBoundPropertyReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReference.kt");
                doTest(fileName);
            }

            @TestMetadata("boundPropertyReferenceOnInt.kt")
            public void testBoundPropertyReferenceOnInt() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnInt.kt");
                doTest(fileName);
            }

            @TestMetadata("boundPropertyReferenceOnLong.kt")
            public void testBoundPropertyReferenceOnLong() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/boundPropertyReferenceOnLong.kt");
                doTest(fileName);
            }

            @TestMetadata("constuctorReference.kt")
            public void testConstuctorReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/constuctorReference.kt");
                doTest(fileName);
            }

            @TestMetadata("functionImportedFromObject.kt")
            public void testFunctionImportedFromObject() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionImportedFromObject.kt");
                doTest(fileName);
            }

            @TestMetadata("functionReference.kt")
            public void testFunctionReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReference.kt");
                doTest(fileName);
            }

            @TestMetadata("functionReferenceFromClass.kt")
            public void testFunctionReferenceFromClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromClass.kt");
                doTest(fileName);
            }

            @TestMetadata("functionReferenceFromObject.kt")
            public void testFunctionReferenceFromObject() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/functionReferenceFromObject.kt");
                doTest(fileName);
            }

            @TestMetadata("innerClassConstuctorReference.kt")
            public void testInnerClassConstuctorReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/innerClassConstuctorReference.kt");
                doTest(fileName);
            }

            @TestMetadata("privateFunctionReference.kt")
            public void testPrivateFunctionReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privateFunctionReference.kt");
                doTest(fileName);
            }

            @TestMetadata("privatePropertyReference.kt")
            public void testPrivatePropertyReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/privatePropertyReference.kt");
                doTest(fileName);
            }

            @TestMetadata("propertyImportedFromObject.kt")
            public void testPropertyImportedFromObject() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyImportedFromObject.kt");
                doTest(fileName);
            }

            @TestMetadata("propertyReference.kt")
            public void testPropertyReference() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReference.kt");
                doTest(fileName);
            }

            @TestMetadata("propertyReferenceFromClass.kt")
            public void testPropertyReferenceFromClass() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromClass.kt");
                doTest(fileName);
            }

            @TestMetadata("propertyReferenceFromObject.kt")
            public void testPropertyReferenceFromObject() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/lambdaInlining/callableReferences/propertyReferenceFromObject.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination")
    @TestDataPath("$PROJECT_ROOT")
    public static class MaskElimination extends AbstractInlineDefaultValuesTests {
        @TestMetadata("32Parameters.kt")
        public void test32Parameters() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/32Parameters.kt");
            doTest(fileName);
        }

        @TestMetadata("33Parameters.kt")
        public void test33Parameters() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/33Parameters.kt");
            doTest(fileName);
        }

        public void testAllFilesPresentInMaskElimination() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/defaultValues/maskElimination"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("kt18792.kt")
        public void testKt18792() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt18792.kt");
            doTest(fileName);
        }

        @TestMetadata("kt19679.kt")
        public void testKt19679() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679.kt");
            doTest(fileName);
        }

        @TestMetadata("kt19679_2.kt")
        public void testKt19679_2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_2.kt");
            doTest(fileName);
        }

        @TestMetadata("kt19679_3.kt")
        public void testKt19679_3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/kt19679_3.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/defaultValues/maskElimination/simple.kt");
            doTest(fileName);
        }
    }
}
