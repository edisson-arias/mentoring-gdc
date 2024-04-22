namespace FizzBuzz.NumberProcessor
{
    internal class EvenProcessor : INumberProcessor
    {
        public string? Process(int number)
        {
            return number % 2 != 0
                ? "even"
                : null;
        }
    }
}
