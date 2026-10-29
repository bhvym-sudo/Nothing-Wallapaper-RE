.class public final LF6/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF6/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LF6/a$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)LF6/a$b;
    .registers 4

    new-instance p0, LF6/a$b;

    sget-object v0, LC6/e$b;->c:LC6/e$b;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LF6/a$b;-><init>(FLC6/e;Lkotlin/jvm/internal/h;)V

    return-object p0
.end method

.method public final b(Ljava/lang/String;)LF6/a$b;
    .registers 3

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE8/i;->o(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_12

    :cond_10
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_12
    invoke-virtual {p0, p1}, LF6/a$b$a;->a(F)LF6/a$b;

    move-result-object p0

    return-object p0
.end method
