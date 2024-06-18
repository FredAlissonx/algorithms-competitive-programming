def fizz_buzz_sum(target):
  sum = 0
  for i in range(target):
    if (i % 3 == 0) or (i % 5 == 0):
      sum += i

  return sum
