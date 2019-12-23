package com.yang.javadatastructure.i_designpattern.c9_composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: Jing Yang
 * @date: 12/23/2019
 */
public class Folder extends Component {

    private String name;
    private ArrayList folders = new ArrayList();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator iterator = folders.iterator();
        while (iterator.hasNext()) {
            Component component = (Component) iterator.next();
            component.printList(prefix + "/" + name);
        }
    }

    @Override
    Component add(Component component) {
        folders.add(component);
        return this;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        int size = 0;
        Iterator it = folders.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            size += component.getSize();
        }
        return size;
    }
}
