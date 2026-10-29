.class final LI8/y$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI8/y;->f()Lv8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final q:LI8/y$e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LI8/y$e;

    invoke-direct {v0}, LI8/y$e;-><init>()V

    sput-object v0, LI8/y$e;->q:LI8/y$e;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Void;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LI8/y$e;->a()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method
