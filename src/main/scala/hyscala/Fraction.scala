/**
  * Created by prathviraj.gavani on 05/01/16.
  */

package hyscala

class Fraction(val numerator:Int,val denominator:Int) {
  println("Numerator " + numerator);
  println("Denominator " + denominator);
  println("Fraction " + (numerator/denominator));

  override def toString = "Numerator " + numerator + " Denominator " + denominator


  def getFraction:Double = numerator/(denominator*1.0)

  def + (other: Fraction): Fraction = {
    val num = (numerator * other.denominator) + (denominator * other.numerator)
    val den = denominator * other.denominator
    new Fraction(num, den)
  }

  def - (other: Fraction): Fraction = {
    val num = (numerator * other.denominator) - (denominator * other.numerator)
    val den = denominator * other.denominator
    new Fraction(num, den)
  }


  def / (other: Fraction): Fraction = {
    val num = numerator * other.denominator
    val den = denominator * other.numerator
    new Fraction(num, den)
  }


  def * (other:Fraction): Fraction = {
    new Fraction(numerator * other.numerator, denominator * other.denominator)
  }

}