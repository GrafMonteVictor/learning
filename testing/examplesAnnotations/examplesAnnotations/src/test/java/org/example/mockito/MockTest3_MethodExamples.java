package org.example.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.example.StaticUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class MockTest3_MethodExamples {
    @Mock
    List mockList1;
    @Mock
    List<String> mockList2;

    @Test
    void whenAnnotation() {
        Mockito.doReturn(10).when(mockList1).size();
        assertEquals(1, mockList1.size());
    }
//
    @Test
    public void whenMockAnnotation() {
        //создаем правило: вернуть 10 при вызове метода size
        Mockito.when(mockList1.size()).thenReturn(9);

        //тут вызывается метод и вернет 10!!
        assertEquals(10, mockList1.size());
    }
//выкидываем исключение
    @Test
    public void whenMockAnnotation2() {
        Mockito.when(mockList1.size()).thenThrow(IllegalStateException.class);
        mockList1.size(); //тут кинется исключение
    }
//выкидываем исключение
    @Test
    public void whenMockAnnotation3() {
//        Mockito.when(mockList1.size()).thenThrow(IllegalStateException.class);
        Mockito.doThrow(IllegalAccessError.class).when(mockList1).size();
        mockList1.size(); //тут кинется исключение
    }
//возврат ответа при параметре
    @Test
    public void whenMockAnnotation4() {
        Mockito.doReturn("Иван").when(mockList1).get(10);
        Mockito.doReturn("Марья").when(mockList1).get(500);
        assertEquals("Иван", mockList1.get(10));
        assertEquals("Марья", mockList1.get(500));

    }
//вернет ответ по правилам кастомной функции
    @Test
    public void whenMockAnnotation5() {
        Mockito.doAnswer(invocation -> {
            int parametr = invocation.getArgument(0);
            return parametr * parametr;
        }).when(mockList1).get(anyInt());
        assertEquals(100, mockList1.get(10));
        assertEquals(625, mockList1.get(25));
    }
//verify - сверка, что вызвался метод
    @Test
    public void whenMockAnnotation6() {
        String name = mockList2.get(10);
        Mockito.verify(mockList2).get(1);
    }
//verify - сверка, что вызвался метод n рвз
    @Test
    public void whenMockAnnotation7() {
        String name1 = mockList2.get(10);
        String name2 = mockList2.get(10);
        String name3 = mockList2.get(10);
        Mockito.verify(mockList2, Mockito.times(3)).get(10);
    }
    //inOrder.verify() - сверка вызовов методов в определенном порядке
    @Test
    public void whenMockAnnotation8() {
        mockList2.get(10);
        mockList2.size();
        mockList2.clear();

        InOrder inOrder = Mockito.inOrder(mockList2);
        inOrder.verify(mockList2).get(1);
        inOrder.verify(mockList2).size();
        inOrder.verify(mockList2).clear();
    }
//проверка выброса исключений
    @Test
    public void whenMockAnnotation9() {
        Mockito.when(mockList2.size()).thenThrow(IllegalStateException.class);
        assertThrows(IllegalStateException.class, () -> mockList2.size());
    }
//проверка стат метода
    @Test
    void givenStaticMethodWithNoArgs () {
        try (MockedStatic<StaticUtils> utilities = Mockito.mockStatic(StaticUtils.class)) {
            utilities.when(StaticUtils::name).thenReturn("Eugen");
            assertEquals(StaticUtils.name(), "Eugen");
        }
        assertEquals(StaticUtils.name(), "Baeldung");
    }
}
