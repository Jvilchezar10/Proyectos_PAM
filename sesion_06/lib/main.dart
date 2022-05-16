import 'package:flutter/material.dart';
import 'package:sesion_o6/pages/Breakcase/home.dart';
import 'Pages/weather/header.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.light(),
      home: home(),
    );
  }
}
