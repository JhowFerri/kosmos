package org.jhowferri.kosmos.group;

public class GroupFactory {

    public static Group makeGroup(String name){
        Group group = new Group();
        group.setName(name);
        return group;
    }

    public static Group makeGroup(String name, String description){
        Group group = makeGroup(name);
        group.setDescription(description);
        return group;
    }

}
