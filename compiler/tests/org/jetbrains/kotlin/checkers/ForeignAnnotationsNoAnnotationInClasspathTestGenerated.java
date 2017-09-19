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

package org.jetbrains.kotlin.checkers;

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
@TestMetadata("compiler/testData/foreignAnnotations/tests")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ForeignAnnotationsNoAnnotationInClasspathTestGenerated extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
    public void testAllFilesPresentInTests() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("android.kt")
    public void testAndroid() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/android.kt");
        doTest(fileName);
    }

    @TestMetadata("aosp.kt")
    public void testAosp() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/aosp.kt");
        doTest(fileName);
    }

    @TestMetadata("eclipse.kt")
    public void testEclipse() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/eclipse.kt");
        doTest(fileName);
    }

    @TestMetadata("findBugsSimple.kt")
    public void testFindBugsSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/findBugsSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("jsr305NullabilityNicknames.kt")
    public void testJsr305NullabilityNicknames() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityNicknames.kt");
        doTest(fileName);
    }

    @TestMetadata("jsr305Simple.kt")
    public void testJsr305Simple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305Simple.kt");
        doTest(fileName);
    }

    @TestMetadata("jsr305Strange.kt")
    public void testJsr305Strange() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305Strange.kt");
        doTest(fileName);
    }

    @TestMetadata("lombokSimple.kt")
    public void testLombokSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/lombokSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("rxjava.kt")
    public void testRxjava() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/rxjava.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305Ignore")
    @TestDataPath("$PROJECT_ROOT")
    public static class Jsr305Ignore extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
        public void testAllFilesPresentInJsr305Ignore() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305Ignore"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("parametersAreNonnullByDefault.kt")
        public void testParametersAreNonnullByDefault() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305Ignore/parametersAreNonnullByDefault.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings")
    @TestDataPath("$PROJECT_ROOT")
    public static class Jsr305NullabilityWarnings extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
        public void testAllFilesPresentInJsr305NullabilityWarnings() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("jsr305NullabilityGenerics.kt")
        public void testJsr305NullabilityGenerics() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/jsr305NullabilityGenerics.kt");
            doTest(fileName);
        }

        @TestMetadata("jsr305NullabilityNicknames.kt")
        public void testJsr305NullabilityNicknames() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/jsr305NullabilityNicknames.kt");
            doTest(fileName);
        }

        @TestMetadata("jsr305Simple.kt")
        public void testJsr305Simple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/jsr305Simple.kt");
            doTest(fileName);
        }

        @TestMetadata("jsr305Strange.kt")
        public void testJsr305Strange() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/jsr305Strange.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes")
        @TestDataPath("$PROJECT_ROOT")
        public static class FromPlatformTypes extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
            public void testAllFilesPresentInFromPlatformTypes() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("arithmetic.kt")
            public void testArithmetic() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/arithmetic.kt");
                doTest(fileName);
            }

            @TestMetadata("array.kt")
            public void testArray() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/array.kt");
                doTest(fileName);
            }

            @TestMetadata("assignToVar.kt")
            public void testAssignToVar() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/assignToVar.kt");
                doTest(fileName);
            }

            @TestMetadata("conditions.kt")
            public void testConditions() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/conditions.kt");
                doTest(fileName);
            }

            @TestMetadata("dataFlowInfo.kt")
            public void testDataFlowInfo() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/dataFlowInfo.kt");
                doTest(fileName);
            }

            @TestMetadata("defaultParameters.kt")
            public void testDefaultParameters() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/defaultParameters.kt");
                doTest(fileName);
            }

            @TestMetadata("delegatedProperties.kt")
            public void testDelegatedProperties() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/delegatedProperties.kt");
                doTest(fileName);
            }

            @TestMetadata("delegation.kt")
            public void testDelegation() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/delegation.kt");
                doTest(fileName);
            }

            @TestMetadata("derefenceExtension.kt")
            public void testDerefenceExtension() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/derefenceExtension.kt");
                doTest(fileName);
            }

            @TestMetadata("derefenceMember.kt")
            public void testDerefenceMember() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/derefenceMember.kt");
                doTest(fileName);
            }

            @TestMetadata("expectedType.kt")
            public void testExpectedType() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/expectedType.kt");
                doTest(fileName);
            }

            @TestMetadata("for.kt")
            public void testFor() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/for.kt");
                doTest(fileName);
            }

            @TestMetadata("functionArguments.kt")
            public void testFunctionArguments() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/functionArguments.kt");
                doTest(fileName);
            }

            @TestMetadata("invoke.kt")
            public void testInvoke() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/invoke.kt");
                doTest(fileName);
            }

            @TestMetadata("kt6829.kt")
            public void testKt6829() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/kt6829.kt");
                doTest(fileName);
            }

            @TestMetadata("multiDeclaration.kt")
            public void testMultiDeclaration() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/multiDeclaration.kt");
                doTest(fileName);
            }

            @TestMetadata("passToJava.kt")
            public void testPassToJava() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/passToJava.kt");
                doTest(fileName);
            }

            @TestMetadata("primitiveArray.kt")
            public void testPrimitiveArray() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/primitiveArray.kt");
                doTest(fileName);
            }

            @TestMetadata("throw.kt")
            public void testThrow() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/throw.kt");
                doTest(fileName);
            }

            @TestMetadata("uselessElvisRightIsNull.kt")
            public void testUselessElvisRightIsNull() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/fromPlatformTypes/uselessElvisRightIsNull.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault")
        @TestDataPath("$PROJECT_ROOT")
        public static class TypeQualifierDefault extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
            public void testAllFilesPresentInTypeQualifierDefault() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("fieldsAreNullable.kt")
            public void testFieldsAreNullable() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/fieldsAreNullable.kt");
                doTest(fileName);
            }

            @TestMetadata("nullabilityFromOverridden.kt")
            public void testNullabilityFromOverridden() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/nullabilityFromOverridden.kt");
                doTest(fileName);
            }

            @TestMetadata("overridingDefaultQualifier.kt")
            public void testOverridingDefaultQualifier() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/overridingDefaultQualifier.kt");
                doTest(fileName);
            }

            @TestMetadata("parametersAreNonnullByDefault.kt")
            public void testParametersAreNonnullByDefault() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/parametersAreNonnullByDefault.kt");
                doTest(fileName);
            }

            @TestMetadata("parametersAreNonnullByDefaultPackage.kt")
            public void testParametersAreNonnullByDefaultPackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/parametersAreNonnullByDefaultPackage.kt");
                doTest(fileName);
            }

            @TestMetadata("springNullable.kt")
            public void testSpringNullable() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/springNullable.kt");
                doTest(fileName);
            }

            @TestMetadata("springNullablePackage.kt")
            public void testSpringNullablePackage() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/jsr305NullabilityWarnings/typeQualifierDefault/springNullablePackage.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault")
    @TestDataPath("$PROJECT_ROOT")
    public static class TypeQualifierDefault extends AbstractForeignAnnotationsNoAnnotationInClasspathTest {
        public void testAllFilesPresentInTypeQualifierDefault() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotations/tests/typeQualifierDefault"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("fieldsAreNullable.kt")
        public void testFieldsAreNullable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/fieldsAreNullable.kt");
            doTest(fileName);
        }

        @TestMetadata("nullabilityFromOverridden.kt")
        public void testNullabilityFromOverridden() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/nullabilityFromOverridden.kt");
            doTest(fileName);
        }

        @TestMetadata("overridingDefaultQualifier.kt")
        public void testOverridingDefaultQualifier() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/overridingDefaultQualifier.kt");
            doTest(fileName);
        }

        @TestMetadata("parametersAreNonnullByDefault.kt")
        public void testParametersAreNonnullByDefault() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/parametersAreNonnullByDefault.kt");
            doTest(fileName);
        }

        @TestMetadata("parametersAreNonnullByDefaultPackage.kt")
        public void testParametersAreNonnullByDefaultPackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/parametersAreNonnullByDefaultPackage.kt");
            doTest(fileName);
        }

        @TestMetadata("springNullable.kt")
        public void testSpringNullable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/springNullable.kt");
            doTest(fileName);
        }

        @TestMetadata("springNullablePackage.kt")
        public void testSpringNullablePackage() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/foreignAnnotations/tests/typeQualifierDefault/springNullablePackage.kt");
            doTest(fileName);
        }
    }
}
