/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keane
 */
public class Country {
    // instance variables
  private String name;
  private String capital;
  private int area;
  private double population;
  private boolean euMember;

  
 /**
 * @param  name  the name of the country
 * @param  cap   the capital of the country
 * @param  ar    the area of the country
 * @param  pop   the population of the country
 */
  public Country (String name, String cap, int ar, double pop, boolean euMem) {
    this.name = name;
    capital = cap;
    area = ar;
    population = pop;
    euMember = euMem;
  }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }

    public boolean isEuMember() {
        return euMember;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", capital=" + capital + ", area=" + area + ", population=" + population + ", EU Member=" + euMember + '}';
    }
}
