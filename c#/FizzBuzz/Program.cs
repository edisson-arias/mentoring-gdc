
// See https://aka.ms/new-console-template for more information


using FizzBuzz.NumberProcessor;
using FizzBuzz.Parameters;

var targetNumber = new ParametersProcessor().TargetNumber;

// for odd and even
//INumberProcessor[] processors = new INumberProcessor[] { new OddProcessor(), new EvenProcessor() };
//for fizz and buzz


var fizzAndBuzzParameters = new FizzAndBuzzParametersProcessor().GetFizzAndBuzzParameters();
INumberProcessor[] processors = new INumberProcessor[] { new FizzProcessor(fizzAndBuzzParameters), new BuzzProcessor(fizzAndBuzzParameters) };

for (var i = 1; i <= targetNumber; i++)
{
    var currentNumberResult= string.Empty;
    foreach (var processor in processors)
    { 
        var processorResult = processor.Process(i);
        if (!string.IsNullOrEmpty(processorResult))
        {
            currentNumberResult += processorResult;
        }
    }
    Console.WriteLine(currentNumberResult == string.Empty
        ? i 
        : currentNumberResult);
}

Console.ReadLine();

