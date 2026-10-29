.class public final Lp7/a$c;
.super Lp7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp7/a$c$a;
    }
.end annotation


# static fields
.field public static final b:Lp7/a$c$a;

.field private static final c:Lp7/a$c;

.field private static final d:Lp7/a$c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lp7/a$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp7/a$c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lp7/a$c;->b:Lp7/a$c$a;

    new-instance v0, Lp7/a$c;

    const-string v1, "Lock"

    invoke-direct {v0, v1}, Lp7/a$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp7/a$c;->c:Lp7/a$c;

    new-instance v0, Lp7/a$c;

    const-string v1, "Home"

    invoke-direct {v0, v1}, Lp7/a$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp7/a$c;->d:Lp7/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lp7/a;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/h;)V

    return-void
.end method

.method public static final synthetic a()Lp7/a$c;
    .registers 1

    sget-object v0, Lp7/a$c;->d:Lp7/a$c;

    return-object v0
.end method

.method public static final synthetic b()Lp7/a$c;
    .registers 1

    sget-object v0, Lp7/a$c;->c:Lp7/a$c;

    return-object v0
.end method
