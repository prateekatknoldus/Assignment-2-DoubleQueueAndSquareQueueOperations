package com.knoldus

import com.knoldus.impl.{DoubleQueue, SquareQueue}

//Object to test DoubleQueue and SquareQueue operations
object MainClassOfAssignment {

  // Main method
  def main(args: Array[String]): Unit = {

    val doubleQueue=new DoubleQueue() // creating object of DoubleQueue class
    val squareQueue=new SquareQueue() // creating object of SquareQueue class

    // performing enqueue, dequeue operations on doubleQueue
    doubleQueue.enqueue(5)
    doubleQueue.enqueue(8)
    doubleQueue.enqueue(3)
    doubleQueue.dequeue()
    doubleQueue.enqueue(12)
    doubleQueue.enqueue(10)
    doubleQueue.dequeue()

    //prints elements of the doubleQueue after some enqueue, dequeue operations performed on it
    print("Elements of DoubleQueue => ")
    for(element <- doubleQueue.queue)
    {
      print(s"$element ")
    }
    print("\n")

    // performing enqueue, dequeue operations on squareQueue
    squareQueue.enqueue(5)
    squareQueue.enqueue(8)
    squareQueue.enqueue(3)
    squareQueue.enqueue(9)
    squareQueue.dequeue()
    squareQueue.enqueue(4)
    squareQueue.dequeue()

    //prints elements of the squareQueue after some enqueue, dequeue operations performed on it
    print("Elements of SquareQueue => ")
    for(element <- squareQueue.queue)
    {
      print(s"$element ")
    }
  }
}
