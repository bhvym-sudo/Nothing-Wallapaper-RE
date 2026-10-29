.class public final LX8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/l$a$a;
    }
.end annotation


# static fields
.field static final synthetic a:LX8/l$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LX8/l$a;

    invoke-direct {v0}, LX8/l$a;-><init>()V

    sput-object v0, LX8/l$a;->a:LX8/l$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
