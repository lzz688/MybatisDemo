lombok插件：
简化实体类的编写，自动生成相应代码
@Getter and @Setter//生成getset方法
@FieldNameConstants
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor 
@NoArgsConstructor
@Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog, @Flogger, @CustomLog
@Data//生成getset方法，toString方法，equals方法，hashcode方法，无参构造方法
@Builder
@SuperBuilder
@Singular
@Delegate
@Value
@Accessors
@Wither
@With
@SneakyThrows
@val
@var

缺点：
1.不支持任意参数的构造器重载
2.加深了阅读源代码的难度