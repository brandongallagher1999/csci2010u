#include <iostream>

using namespace std;

struct Node{
  int data;
  Node* next;
};

class LinkedList{

protected:
  Node* root;

public:
  LinkedList(){
    root = NULL;
  }

  void insert(int d) //Insertion of a node
  {
    if (root == NULL){
      root = new Node;
      root->data = d;
    }

    Node* current = root;
    while (current->next != NULL){
      current = current->next;
    }
    current->next = new Node;
    current->data = d;
  }

  //void delete()

  void print(){
    Node* current = root;
    while (current->next != NULL){
      cout << current->data << endl;
      current = current->next;
    }
  }

};



int main()
{
  LinkedList* list = new LinkedList;
  list->insert(1);
  list->insert(3);
  list->insert(5);

  list->print();

  delete list;

  return 0;
}
