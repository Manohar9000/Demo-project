package Config;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
		@Override
		public void transform ( ITestAnnotation annotation, Class testClass, Constructor testConstructor,
		final Method testMethod) {
		annotation.setRetryAnalyzer (MyRetry.class);
		}
		}

