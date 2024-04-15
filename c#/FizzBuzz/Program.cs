
// See https://aka.ms/new-console-template for more information


using FizzBuzz;

var parameters = ParametersProcessor.Get();
for (var i = 1; i <= parameters.TargetNumber; i++)
{
    if (i % parameters.FizzNumber == 0 && i % parameters.BuzzNumber != 0)
    {
        Console.WriteLine(parameters.FizzString);
    }
    if (i % parameters.BuzzNumber == 0 &&
        i % parameters.FizzNumber != 0) 
    {
        Console.WriteLine(parameters.BuzzString);
    }
    if ((i % parameters.FizzNumber == 0) &&
        i % parameters.BuzzNumber == 0)
    { 
        Console.WriteLine($"{parameters.FizzString}{parameters.BuzzString}");
    }

    if ((i % parameters.FizzNumber != 0) &&
    i % parameters.BuzzNumber != 0)
    {
        Console.WriteLine(i);
    }
}

Console.ReadLine();

