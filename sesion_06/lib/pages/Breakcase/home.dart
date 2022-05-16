import 'package:flutter/Material.dart';
import 'package:sesion_o6/pages/Breakcase/Profile.dart';
import 'package:sesion_o6/pages/Weather/header.dart';

class home extends StatelessWidget {
  home({Key? key}) : super(key: key);
  List<Widget> pages = [
    Profile(),
    header(),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: PageView(
        physics: BouncingScrollPhysics(),
        children: pages,
      ),
    );
  }
}
