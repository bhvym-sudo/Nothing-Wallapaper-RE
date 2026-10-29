.class public abstract LO5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/a$a;
    }
.end annotation


# static fields
.field public static final a:LO5/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LO5/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO5/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LO5/a;->a:LO5/a$a;

    return-void
.end method
