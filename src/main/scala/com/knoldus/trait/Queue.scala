package com.knoldus.`trait`

// trait having an abstract method 'enqueue' and a concrete method 'dequeue'
trait Queue {
  var queue: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1

  // method to insert an element in a queue
  def enqueue(element:Int)

  // method(having a concrete definition) to remove the first element from the queue
  def dequeue(): Unit = {
    if (front== -1 && rear == -1){
      println("Queue is empty")
    }
    else if(front == rear){
      queue = queue.drop(1)
      front = -1
      rear = -1
    }
    else{
      queue = queue.drop(1)
      front = front + 1
    }
  }
}
