def missing_int(input: list[int])-> int:
  for i in range(len(input) + 1):
    if i not in input:
      return i
  return 0
