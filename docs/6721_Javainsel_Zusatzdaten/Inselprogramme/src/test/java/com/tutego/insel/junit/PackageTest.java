package com.tutego.insel.junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith( JUnitPlatform.class )
@SelectPackages( "com.tutego.insel.junit.util" )
public class PackageTest {
}
