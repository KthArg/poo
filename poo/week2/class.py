class Person:
    def __init__(self, first_name: str, age: int):
        self._first_name = first_name
        self._age = age

    def get_first_name(self) -> str:
        return self._first_name

    def set_first_name(self, first_name: str) -> None:
        self._first_name = first_name

    def get_age(self) -> int:
        return self._age

    def set_age(self, age: int) -> None:
        self._age = age