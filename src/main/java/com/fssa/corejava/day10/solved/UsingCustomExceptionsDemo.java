package com.fssa.corejava.day10.solved;

class TaskValidator {
	public static boolean validate(Task task) throws ValidationException {
		if (task == null)
			throw new ValidationException("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new ValidationException("Task name is empty");
		return true;
	}
}

public class UsingCustomExceptionsDemo {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown

		try {
			TaskValidator.validate(null);
		} catch (ValidationException e) {
			System.out.print(false);
		}
	}
}
