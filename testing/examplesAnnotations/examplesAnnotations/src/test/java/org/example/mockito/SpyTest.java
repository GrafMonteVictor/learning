package org.example.mockito;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyTest {
    @Spy
    List<String> mockList;

    @Test
    public void whenMockAnnotation() {
        mockList  = new ArrayList<>();
        mockList.add("one");
        mockList.add("two");
        System.out.println(mockList.size());
    }
}
