package com.auction.repository;

import com.auction.configuration.AppConfig;
import com.auction.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserRepositoryTest {

//    @Autowired
//    UserRepository userRepository;
//
//    @Test
//    public void findUserByLoginTestCase() {


//        User igor = new User("Igor","pas44","pas44");
//        igor = userRepository.save(igor);
//
//        User result = userRepository.findUserByLogin("Sasha");
//
//        assert (result, i)
//        assertThat(result.size(), is(1));
//        assertThat(result, hasItem(dave));
//    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void tearDown() throws Exception {

    }
}
