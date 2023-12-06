package com.pruebas;

import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {
    @InjectMocks
    private Game_rock_paper_sccisors gm;

    @Mock
    Scanner console;

    // 3 A : 1) Act -> definition of class 2) arrange -> Method Test 3) Asset -> esperado contra obtenido.
    
    @Test
    public void QuitGameTest(){
      //act
      when(console.nextLine()).thenReturn("Quit");
      //arrange
      gm.play();
      //assert
    }

    @Test
    public void RockQuitGameTest(){
      when(console.nextLine()).thenReturn("Rock").thenReturn("Quit");
      gm.play();
    }

    @Test
    public void testRockVsScissors() {
        when(console.nextLine()).thenReturn("Rock").thenReturn("Scissors").thenReturn("Quit");
        gm.play();
    }

    @Test
    public void testPaperVsRock() {
        when(console.nextLine()).thenReturn("Paper").thenReturn("Rock").thenReturn("Quit");
        gm.play();
    }

    @Test
    public void testScissorsVsPaper() {
        when(console.nextLine()).thenReturn("Scissors").thenReturn("Paper").thenReturn("Quit");
        gm.play();
    }

    @Test
    public void testTieScenario() {
        when(console.nextLine()).thenReturn("Rock").thenReturn("Rock").thenReturn("Quit");
        gm.play();
    }

    @Test
    public void testTiePaper() {
        when(console.nextLine()).thenReturn("Rock").thenReturn("Rock").thenReturn("Quit");
        gm.play();
    }

    @Test
    public void testTieScissors() {
        when(console.nextLine()).thenReturn("Rock").thenReturn("Rock").thenReturn("Quit");
        gm.play();
    }
}
