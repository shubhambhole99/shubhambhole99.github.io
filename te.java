To initialize an list with 60 zeros you do:

List<Integer> list = new ArrayList<Integer>(Collections.nCopies(60, 0));
If you want to create a list with 60 different objects, you could use the Stream API with a Supplier as follows:

List<Person> persons = Stream.generate(Person::new)
                             .limit(60)
                             .collect(Collectors.toList());