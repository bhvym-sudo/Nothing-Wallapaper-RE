.class public final Lv6/a;
.super Lk6/c;
.source "SourceFile"


# static fields
.field public static final m:Lv6/a;

.field private static final n:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lv6/a;

    invoke-direct {v0}, Lv6/a;-><init>()V

    sput-object v0, Lv6/a;->m:Lv6/a;

    const-wide/32 v0, 0xea60

    sput-wide v0, Lv6/a;->n:J

    return-void
.end method

.method private constructor <init>()V
    .registers 3

    const-string v0, "Edit"

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lk6/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 3

    sget-wide v0, Lv6/a;->n:J

    return-wide v0
.end method
