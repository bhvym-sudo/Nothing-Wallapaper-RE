.class public final LJ6/e$a$c;
.super LJ6/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:LJ6/e$a$c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ6/e$a$c;

    invoke-direct {v0}, LJ6/e$a$c;-><init>()V

    sput-object v0, LJ6/e$a$c;->a:LJ6/e$a$c;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .registers 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of p0, p1, LJ6/e$a$c;

    if-nez p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    return v0
.end method

.method public hashCode()I
    .registers 1

    const p0, -0x4c720f9

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "NoCompressionTask"

    return-object p0
.end method
