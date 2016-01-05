/*
########################################################################################
#                                                                                      #
#                                     WodBuilder                                       #
#                               Written by Nick Moore                                  #
#        small class to build a wod for me during the spring semester of 2016          #
#                                                                                      #
########################################################################################
*/
 
import java.util.Date;
import java.util.Random;  //for randomly picking exercises

public class wodBuilder{
  private final String warmups[] = {
                              "handstands", 
                              "upright support",
                              "skin the cat",
                              "scap circles",
                              "quad roll",
                              "hip roll",
                              "overhead squats",
                              "samson stretch"
                              };
  private final String strengths[] = {
                                "pushups pair",
                                "rows pair",
                                "deadlift",
                                "planche pair",
                                "single-leg-squat pair",
                                "manna pair",
                                "side-lever pair",
                                "front-lever pair",
                                ""
                                };
  private final String workouts[] = {
                                      "double-unders",
                                      "goblet-squats",
                                      "push-ups",
                                      "kettlebell swings",
                                      "
                                      };
  private final String cooldowns[] = {
                                        "ham-stretch",
                                        "jefferson curls",
                                        "hip stretch",
                                        "neck stretch",
                                        "
                                        };

  private String warmup[3];
  private String strength[2];
  private String workout[3];
  private String cooldown[3];

  private int warmupNum;
  private int strengthNum;
  private int workoutNum;
  private int cooldownNum;
  private int minutes;
  
  private Date today;
  private Random numChooser;
  
  public wodBuilder(){
    //initialize the date and the random number generator
    today = new Date();
    
    //first pick the length of the workout
    //then pick the number of exercises in strength which will be 1, 2, or 3
    //cooldown should be 2 or 3, same for warmup
  }
  private buildWod(){
  
  }
}

