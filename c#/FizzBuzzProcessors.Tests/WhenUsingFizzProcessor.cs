using FizzBuzz.NumberProcessor;
using FizzBuzz.Parameters;
using NSubstitute;
using Xunit;

namespace FizzBuzzProcessors.Tests
{
    public class WhenUsingFizzProcessor
    {
        [Fact]
        public void IfNumberIsFizzThenPrintFizz()
        {
            var userInputProvider = Substitute.For<IUserInputProvider>();
            var parameters = new FizzAndBuzzParametersProcessor(userInputProvider);
            var processor = new FizzProcessor(parameters);
            var result = processor.Process(3);
            Assert.Equal("Fizz", result);
        }

        [Fact]
        public void IfNumberIsNotFizzThenReturnsNull()
        {
            var userInputProvider = Substitute.For<IUserInputProvider>();
            var parameters = new FizzAndBuzzParametersProcessor(userInputProvider);
            var processor = new FizzProcessor(parameters);
            var result = processor.Process(7);
            Assert.Null(result);
        }

        [Fact] 
        public void CanUseCustomStringForFizz()
        {
            var userInputProvider = Substitute.For<IUserInputProvider>();
            var parameters = new FizzAndBuzzParametersProcessor(userInputProvider);
            var processor = new FizzProcessor(parameters);
            var customFizzString = "customFizzString";
            //userInputProvider.GetAnswer(Arg.Is<string>(s => s.Contains("fizz string"))).Returns(customFizzString);
            userInputProvider.GetAnswer(default).ReturnsForAnyArgs(ci =>
            { 
                var prompt = ci.ArgAt<string>(0);
                if (prompt.Contains("fizz string"))
                {
                    return customFizzString;
                }
                return null;
            });
            var result = processor.Process(3);

            Assert.Equal(customFizzString, result);
        }
    }
}
