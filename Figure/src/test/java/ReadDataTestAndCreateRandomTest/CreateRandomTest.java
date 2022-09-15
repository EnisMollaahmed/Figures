package ReadDataTestAndCreateRandomTest;

import Figures.Figure;
import ReadInfoAndCreateRandom.CreateRandom;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateRandomTest {
    ArrayList<Figure> figureArrayList = new ArrayList<>();
    CreateRandom createRandom = new CreateRandom();
    final int members = 3;
    @Test
    void testCreateRandom() throws Exception {
        createRandom.createRandomFigures(figureArrayList,members);
        assertEquals(members, figureArrayList.size());
    }
}
