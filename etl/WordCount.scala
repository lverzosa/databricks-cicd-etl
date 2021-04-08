// Databricks notebook source
// Changes

// COMMAND ----------

// MAGIC %md This takes in a bunch of texts and counts the words - Test

// COMMAND ----------

// MAGIC %python
// MAGIC 
// MAGIC print(True)

// COMMAND ----------

// TODO change to read from dbfs

val text:String = "This self-paced guide is the “Hello World” tutorial for Apache Spark using Databricks. In the following tutorial modules, you will learn the basics of creating Spark jobs, loading data, and working with data. You’ll also get an introduction to running machine learning algorithms and working with streaming data. Databricks lets you start writing Spark queries instantly so you can focus on your data problems."

// COMMAND ----------

val rdd = sc.parallelize(Seq(text.replaceAll("[^A-Za-z0-9 _]", "").toLowerCase))

// COMMAND ----------

val tokenizedRdd = rdd.flatMap(_.split(" "))

// COMMAND ----------

val distinctSum = tokenizedRdd.map( x => (x, 1) ).reduceByKey( _ + _ )

// COMMAND ----------

distinctSum.collect()

// COMMAND ----------

