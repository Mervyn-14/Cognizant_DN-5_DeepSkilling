public class UserServiceTest {

    @Test
    void testGetUserById() {
        UserRepository mockRepository =  mock(UserRepository.class);
        User user =  new User(1L, "Mervyn");

        when(mockRepository.findById(1L))  .thenReturn(Optional.of(user));

        UserService userService =  new UserService(mockRepository);

        User result =userService.getUserById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals( "Mervyn", result.getName());

        verify(mockRepository) .findById(1L);
    }
}