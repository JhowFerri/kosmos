package org.jhowferri.kosmos.group;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupTest {

    Group galicianPortuguese;
    Group latin;
    Group portuguese;
    Group galician;

    @BeforeEach
    void setup(){
        createGroups();
        setupRelationships();
    }

    void createGroups(){
        galicianPortuguese = GroupFactory.makeGroup("Galician-Portuguese", "An old language spoken at the moment only on the Galician region in Spain.");
        latin = GroupFactory.makeGroup("Latin");
        portuguese = GroupFactory.makeGroup("Portuguese");
        galician = GroupFactory.makeGroup("Galician");
    }

    void setupRelationships(){
        setupParentRelationship();
        setupChildrenRelationship();
    }

    void setupParentRelationship(){
        galicianPortuguese.setParent(latin);
    }

    void setupChildrenRelationship(){
        galicianPortuguese.getChildren().add(portuguese);
        galicianPortuguese.getChildren().add(galician);
    }

    @Test
    void shouldReturnCorrectName(){
        assertEquals("Galician-Portuguese", galicianPortuguese.getName());
    }

    @Test
    void shouldReturnCorrectDescription(){
        assertEquals("An old language spoken at the moment only on the Galician region in Spain.", galicianPortuguese.getDescription());
    }

    @Test
    void shouldReturnCorrectParent(){
        assertEquals(latin, galicianPortuguese.getParent());
    }

    @Test
    void shouldReturnCorrectChildren(){
        List<Group> testList = new ArrayList<>();
        testList.add(portuguese);
        testList.add(galician);
        assertEquals(testList, galicianPortuguese.getChildren());
    }
}
