* Test name should be [ test + methodName + condition to be tested ]
* Empty test will always succeed as there is nothing to fail
* @Before runs before every test method and @After runs after every test method
* @BeforeClass runs once for a test class at its start and @AfterClass runs once for a test class after its end
* @BeforeClass & @AfterClass should be static test methods. So, only class level properties can be initialized in these two annotations
* For testing exceptions, use @Test(expected = ExceptionName.class)
* For testing performance, use @Test(timeout = timeinMs)
* For Parameterized tests, use @RunWith(Parameterized.class) and for every new type of parameterized test, we have to create new test class
