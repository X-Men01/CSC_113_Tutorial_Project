# Theater Management System

This repository contains a Java-based Theater Management System developed for the CSC 113 course. The system allows managing movie listings, categorizing them as either Adult or Kids, tracking ticket prices, and managing additional amenities like restaurants within a theater.


## Overview

The Theater Management System simulates functionalities for managing a theater's movie catalog and restaurant listings. It includes functionalities to add movies and restaurants, calculate ticket prices based on movie categories, and display various details about the theater’s offerings.

## Classes and Data Structures

1. **Movie Class (Movie.java)**: 
   - Stores attributes for movies like duration, rating, year, and category.
   - Contains methods for calculating ticket prices and displaying movie details.

2. **Adult Class (Adult.java)**:
   - Extends `Movie` and includes an age attribute, indicating the age restriction for adult movies.

3. **Kids Class (Kids.java)**:
   - Extends `Movie` and includes a `BreakTime()` method, which returns a break duration for kids' movies.

4. **Theater Class (Theater.java)**:
   - Manages the theater’s details, including name, location, and the number of halls.
   - Allows adding movies and restaurants, calculating average ticket prices, and counting kids' movies.

5. **Restaurant Class (Restaurant.java)**:
   - Represents restaurants in the theater, with attributes like name and number of dishes.

6. **MovieHistory Interface (MovieHistory.java)**:
   - Includes methods for saving movie data to a file and loading it, specifically filtering for adult movies.

7. **Category Enum (Category.java)**:
   - Enumerates possible movie genres, such as Action, Comedy, Horror, Drama, and Fantasy.

## Operations

### Core Functionalities
1. **Add Movie**: Adds a movie to the theater if there’s space and the movie isn’t already listed.
2. **Add Restaurant**: Adds a restaurant to the theater, provided there’s space.
3. **Average Price for Adult Movies**: Calculates the average ticket price for adult movies. If there are no adult movies, throws an `ArithmeticException`.
4. **Count Kids Movies**: Recursively counts the number of kids' movies in the theater.
5. **Release Year Filter**: Returns the number of movies released after a specified year.
6. **Save and Load Movies**: Methods to save movie data to a file and load data from a file, filtering for adult movies only.
