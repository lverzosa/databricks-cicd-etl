// Databricks notebook source
// MAGIC %md This takes in a bunch of texts and counts the words

// COMMAND ----------

// TODO change to read from dbfs

val text = "This self-paced guide is the “Hello World” tutorial for Apache Spark using Databricks. In the following tutorial modules, you will learn the basics of creating Spark jobs, loading data, and working with data. You’ll also get an introduction to running machine learning algorithms and working with streaming data. Databricks lets you start writing Spark queries instantly so you can focus on your data problems."

// COMMAND ----------

val rdd = sc.parallelize(Seq(text))

// COMMAND ----------

val tokenizedRdd = rdd.flatMap(_.split(" "))

// COMMAND ----------

tokenizedRdd.count()

// COMMAND ----------

