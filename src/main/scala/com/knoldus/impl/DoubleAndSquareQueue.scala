package com.knoldus.impl

import com.knoldus.`trait`.Queue

// class mixing the Queue trait and having 'enqueue' method to enqueue an element after doubling it
class DoubleQueue extends Queue{
  // overriding the enqueue method of Queue trait so that it could enqueue an element after doubling it
  override def enqueue(element:Int):Unit={
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(element*2) // enqueuing an element after doubling it
    }
    else{
      rear = rear + 1
      queue = queue ::: List(element*2) // enqueuing an element after doubling it
    }
  }
}

// class mixing the Queue trait and having 'enqueue' method to enqueue an element after squaring it
class SquareQueue extends Queue{
  //overriding the enqueue method of Queue trait so that it could enqueue an element after squaring it
  override def enqueue(element:Int):Unit={
    if (front== -1 && rear == -1) {
      front = front + 1
      rear = rear + 1
      queue = queue ::: List(element*element) // enqueuing an element after squaring it
    }
    else{
      rear = rear + 1
      queue = queue ::: List(element*element) // enqueuing an element after squaring it
    }
  }
}
