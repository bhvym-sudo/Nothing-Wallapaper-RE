.class public final Lp7/a$b;
.super Lp7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Lp7/a$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lp7/a$b;

    invoke-direct {v0}, Lp7/a$b;-><init>()V

    sput-object v0, Lp7/a$b;->b:Lp7/a$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 3

    const-string v0, "NewLock"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lp7/a;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/h;)V

    return-void
.end method
