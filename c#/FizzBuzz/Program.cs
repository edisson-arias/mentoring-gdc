
// See https://aka.ms/new-console-template for more information


using FizzBuzz;
using FizzBuzz.BusinessLayer;
using FizzBuzz.NumberProcessor;
using FizzBuzz.Parameters;

var targetNumber = new ParametersProcessor().TargetNumber;

// for odd and even
//INumberProcessor[] processors = new INumberProcessor[] { new OddProcessor(), new EvenProcessor() };
//for fizz and buzz


var fizzAndBuzzParametersProcessor = new FizzAndBuzzParametersProcessor(new UserInputProvider());
INumberProcessor[] processors = new INumberProcessor[] { new FizzProcessor(fizzAndBuzzParametersProcessor), new BuzzProcessor(fizzAndBuzzParametersProcessor) };

var algorithm= new Algorithm(processors);
algorithm.Run(targetNumber);

Console.ReadLine();

