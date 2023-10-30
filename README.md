Test case for Gradle issue: Test task does not run JUnit test with @Category and @RunWith annotations.
It looks like PowerMock replaces Category annotation with proxy: 
