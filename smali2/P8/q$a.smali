.class public final LP8/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/q$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:LP8/q$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LP8/q$a;

    invoke-direct {v0}, LP8/q$a;-><init>()V

    sput-object v0, LP8/q$a;->a:LP8/q$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
