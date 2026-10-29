.class public abstract LY7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY7/a$a;
    }
.end annotation


# static fields
.field public static final a:LY7/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LY7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY7/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LY7/a;->a:LY7/a$a;

    return-void
.end method
