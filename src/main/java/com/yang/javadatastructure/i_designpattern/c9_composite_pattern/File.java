package com.yang.javadatastructure.i_designpattern.c9_composite_pattern;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class File extends Component {

    private String name;
    private String type;
    private int size;

    public File(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    @Override
    void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    Component add(Component component) {
        try {
            throw new Exception("Cannot add component to file!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        return size;
    }

    String getType() {
        return type;
    }
}
