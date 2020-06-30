package com.ljj.chapter17.decorator.coffeebar.mydecorator

import com.ljj.chapter17.decorator.coffeebar.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
