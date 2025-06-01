package org.example.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

//@ExtendWith(MockitoExtension.class)
class MockTest1 {
    @Test
    public void whenNotUseMockAnnotation_thenCorrect() {
        List mockList = Mockito.mock(ArrayList.class);
        //эти методы не будут ничего делать – это заглушки
        mockList.add("one");
        mockList.add("two");
    }
}
