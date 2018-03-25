package com.aniketgovekar.abstractclasses.challenges;

public interface INodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
