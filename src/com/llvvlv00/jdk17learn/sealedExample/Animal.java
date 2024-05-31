package com.llvvlv00.jdk17learn.sealedExample;

/**
 * 限制子类继承，防止子类变父类
 */
abstract public sealed class Animal permits Dog, Cat {
}
