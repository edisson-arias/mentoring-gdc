namespace FizzBuzz.Parameters
{
    public interface IUserInputProvider
    {
        string GetAnswer(string prompt);
    }
    public class UserInputProvider : IUserInputProvider
    {
        public string GetAnswer(string prompt)
        {
            Console.WriteLine(prompt);
            return Console.ReadLine();
        }
    }
}
