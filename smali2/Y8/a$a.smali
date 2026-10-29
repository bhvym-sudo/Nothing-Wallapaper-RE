.class public final LY8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY8/a$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:LY8/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LY8/a$a;

    invoke-direct {v0}, LY8/a$a;-><init>()V

    sput-object v0, LY8/a$a;->a:LY8/a$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
